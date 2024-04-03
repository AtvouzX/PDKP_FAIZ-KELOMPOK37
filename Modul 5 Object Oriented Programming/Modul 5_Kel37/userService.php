<?php
class userService
{
    protected $email;    // using protected so they can be accessed
    protected $password; // and overidden if necessary
    protected $dataUser; // dummy data
    protected $getRole;  // stores the role data

    public function __construct($email, $password) 
    {
        $this-> dataUser = [
            (object) [
                'email'     => "nama1@kelompok37.com",
                'password'  => "12345",
                'role'      => "Super Admin"
            ],
            (object) [
                'email'     => "nama2@kelompok37.com",
                'password'  => "4567",
                'role'      => "User"
            ]
        ];
        $this->email = $email;
        $this->password = $password;
    }

    public function login()
    {
        $user = $this->checkCredentials();
        if($user) {
            $this->getRole = $user->role;
            return $get_data = $user->email;
        } else {
            return false;
        }
    }

    protected function checkCredentials()
    {
        foreach($this-> dataUser as $key => $value) {
            if($value->email == $this->email && $value->password == $this->password) {
                return $value;
            }
        }
        return false;
    }

    public function getRole()
    {
        return $this->getRole;
    }
}

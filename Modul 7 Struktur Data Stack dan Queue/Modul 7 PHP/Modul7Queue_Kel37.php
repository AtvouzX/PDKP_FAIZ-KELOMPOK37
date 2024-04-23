<h2>PHP Queue</h2>
<form action="" method="POST">
    ==========[ ENQUEUE ]==========<br><br>
    <label for="data">Data 1: </label>
    <input type="text" name="data1" /><br>
    <label for="data">Data 2: </label>
    <input type="text" name="data2" /><br>
    <label for="data">Data 3:</label>
    <input type="text" name="data3" />
    <br><br>
    ===========[ DEQUEUE ]==========<br><br>
    <label for="data">Amount: </label>
    <input type="number" name="jmldeq" />
    <br><br>
    <input name="submit" type="submit" value="Submit" />
    <br><br>
    ===========================
</form>

<?php

$queue = new SplQueue();
$queue->enqueue('Messi');
$queue->enqueue('Ronaldo');
$queue->enqueue('Benzema');
$queue->enqueue('Haaland');
$queue->enqueue('Mbappe');

print("Data lama[" . sizeof($queue) . "]: ");
for ($i = 0; $i < sizeof($queue); $i++) {
    print($queue[$i] . " ");
}

if (isset($_POST['submit'])) {

    /////// ENQUEUE ///////
    if ($_POST['data1'] != NULL || $_POST['data2'] != NULL || $_POST['data3'] != NULL) {
        $data[0] = $_POST['data1'];
        $data[1] = $_POST['data2'];
        $data[2] = $_POST['data3'];
        for ($i = 0; $i < 3; $i++) {
            if ($data[$i] != null) {
                $queue->enqueue($data[$i]);
            }
        }

        print("<br><br>==========[ ENQUEUE ]==========<br><br>");

        print("Data baru[" . sizeof($queue) . "]: ");
        for ($i = 0; $i < sizeof($queue); $i++) {
            print($queue[$i] . " ");
        }
    }

    /////// DEQUEUE ///////
    if ($_POST['jmldeq'] != NULL) {
        print("<br><br>===========[ DEQUEUE ]==========<br><br>");
        $jmldeq = $_POST['jmldeq'];
        for ($i = 0; $i < $jmldeq; $i++) {
            $queue->dequeue();
        }
        print("Data baru[" . sizeof($queue) . "]: ");
        for ($i = 0; $i < sizeof($queue); $i++) {
            print($queue[$i] . " ");
        }
    }

    /////// RESULT ///////
    print("<br><br>===========================<br><br>");
    print("Data terdepan : " . $queue->bottom());
}


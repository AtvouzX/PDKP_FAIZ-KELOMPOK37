from ctypes import resize
from tkinter import *
from tkinter import messagebox
from tkinter import ttk
from tkinter.messagebox import *


def on_click():
    print(askquestion("DKP", "Apakah anda senang mengikuti praktikum DKP?"))


window = Tk()
window.geometry("320x220")
window.title("GUI DKP")
window.resizable(width = 0, height = 0)


menu = Menu(window)
itemfile = Menu(menu, tearoff=0)
itemhelp = Menu(menu, tearoff=0)
itemfile.add_command(label='New')
itemfile.add_command(label='Save')
itemfile.add_command(label='Open')
itemhelp.add_command(label = 'About')
menu.add_cascade(label='File', menu=itemfile)
menu.add_cascade(label='Edit')
menu.add_cascade(label='View')
menu.add_cascade(label='Help', menu=itemhelp)
window.config(menu=menu)


buttonsubmit = Button(window, 
                text = "Submit", 
                command = on_click,
                font = ("Times New Roman", 13),
                fg = "black",
                state = ACTIVE 
                ).place(x = 125, y = 170)


labelnama = Label(window,
                text = "Name\t:",
                font = ("times new roman", 10)).place(x=30, y=20)
labeljk = Label(window,
                text = "Gender\t:",
                font = ("times new roman", 10)).place(x=30, y=50)
labelhobby = Label(window,
                text = "Hobby\t:",
                font = ("times new roman", 10)).place(x=30, y=120)


strnama = StringVar()
entrynama = Entry(window,
                textvariable = strnama,
                font = ("times new roman", 10)).place(x=100, y=20)


radio = IntVar()
R1 = Radiobutton(window,
                text = "Pria",
                font = ("times new roman", 10),
                variable = radio,
                value = 1).place(x = 100, y = 50)
R2 = Radiobutton(window,
                text = "Wanita",
                font = ("times new roman", 10),
                variable = radio,
                value = 2).place(x = 100, y = 70)


strhobby = StringVar(value='Pilih di sini') 
combobox1 = ttk.Combobox(window, 
                width = 17,
                font = ("times new roman", 10), 
                textvariable = strhobby, 
                state ="readonly")
combobox1.place(x=100, y=117)
combobox1['values'] = ('Gaming','Music','Movie')


window.mainloop()
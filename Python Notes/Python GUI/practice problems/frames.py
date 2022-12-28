
from tkinter import *

root = Tk()
root.geometry("550x350")


def b1():
    print("Hello guys welcome to my tou tube channel!")

def b2():
    print("I am Himansu!")

def b3():
    print("I will be passing as an software Engineer at 2023")

def b4():
    print("Thank you for hearing me!")

frame = Frame(root,borderwidth=6,bg="grey",relief=SUNKEN)
frame.pack(side=LEFT,anchor="nw",padx=70,pady=20)

b1 = Button(frame,fg="blue",text = "Click!",padx=10,command=b1)
b1.pack(side=LEFT)

b2 = Button(frame,fg="blue",text = "Click!",padx=10,command=b2)
b2.pack(side=LEFT)

b3 = Button(frame,fg="blue",text = "Click!",padx=10,command=b3)
b3.pack(side=LEFT)

b4 = Button(frame,fg="blue",text = "Click!",padx=10,command=b4)
b4.pack(side=LEFT)


root.mainloop()
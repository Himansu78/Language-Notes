from tkinter import *

win = Tk()
win.title("Himansu")
win.geometry("500x400")

title_label = Label(text="Ready",bg="blue",fg="white",
padx= 10,pady=10,font=("Giveny",10,"bold","italic"),borderwidth=3,relief=RAISED)
title_label.pack(side=BOTTOM,anchor="se",fill=X,padx=5,pady=5)


win.mainloop()

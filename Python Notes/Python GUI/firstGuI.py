from tkinter import *
main_window = Tk()

#labels
Label(main_window,text='Enter name: ').grid(row=0,column = 0)

Label(main_window,text='What your age: ').grid(row=1,column_=0)

#Text Input
Entry(main_window, width = 50,borderwidth = 15).grid(row = 0,column = 1)

Entry(main_window, width = 50,borderwidth=5).grid(row = 1,column = 1)

#Buttons
Button(main_window,text="Click Me").grid(row=2,column=1 )





main_window.mainloop()
from tkinter import *
win = Tk()
#win.geometry('350x400')
win.title('Simple Calculator')


#input
e = Entry(win,width=35,borderwidth=5)
e.grid(row=0,column=0,columnspan=4,padx=30)

list_of_number = []
list_of_operator = []
#functions
def number_input(number):
    current_value = e.get()
    e.delete(0,END)
    e.insert(0,str(current_value)+str(number))

def clear_values():
    list_of_number.clear()
    list_of_operator.clear()
    e.delete(0, END)


def sum():
    num1 = e.get()
    list_of_number.append(num1)
    list_of_operator.append('+')
    e.delete(0,END)

def sub():
    num1 = e.get()
    list_of_number.append(num1)
    list_of_operator.append('-')
    e.delete(0,END)

def mul():
    num1 = e.get()
    list_of_number.append(num1)
    list_of_operator.append('*')
    e.delete(0,END)

def div():
    num1 = e.get()
    list_of_number.append(num1)
    list_of_operator.append('/')
    e.delete(0,END)

def equals():
    num1 = e.get()
    list_of_number.append(num1)
    e.delete(0,END)
    ans = list_of_number[0]
    i=0
    for values in list_of_number[1:]:
        ans = eval(str(ans)+' '+list_of_operator[i]+' '+values)
        i += 1
    e.insert(0,ans)


#Buttons
btn9 = Button(win,text='9',padx=40,pady = 20,command=lambda:number_input(9)).grid(row=1,column=1)
btn8 = Button(win,text='8',padx=40,pady = 20,command=lambda:number_input(8)).grid(row=1,column=2)
btn7 = Button(win,text='7',padx=40,pady = 20,command=lambda:number_input(7)).grid(row=1,column=3)

btn6 = Button(win,text='6',padx=40,pady = 20,command=lambda:number_input(6)).grid(row=2,column=1)
btn5 = Button(win,text='5',padx=40,pady = 20,command=lambda:number_input(5)).grid(row=2,column=2)
btn4 = Button(win,text='4',padx=40,pady = 20,command=lambda:number_input(4)).grid(row=2,column=3)

btn3 = Button(win,text='3',padx=40,pady = 20,command=lambda:number_input(3)).grid(row=3,column=1)
btn2 = Button(win,text='2',padx=40,pady = 20,command=lambda:number_input(2)).grid(row=3,column=2)
btn1 = Button(win,text='1',padx=40,pady = 20,command=lambda:number_input(1)).grid(row=3,column=3)

btn0 = Button(win,text='0',padx=40,pady = 20,command=lambda:number_input(0)).grid(row=4,column=2)

btn_add = Button(win,text='+',padx=38.50,pady = 20,command=sum).grid(row=1,column=0)
btn_sub = Button(win,text='-',padx=40,pady = 20,command=sub).grid(row=2,column=0)
btn_mul = Button(win,text='*',padx=40,pady = 20,command=mul).grid(row=3,column=0)
btn_div = Button(win,text='/',padx=40,pady = 20,command=div).grid(row=4,column=0)
btn_equals = Button(win,text='=',padx=40,pady = 20,command = equals).grid(row=4,column=3)

btn_clear = Button(win,text='cls',padx=36,pady = 20,command=clear_values).grid(row=4,column=1)

win.mainloop()
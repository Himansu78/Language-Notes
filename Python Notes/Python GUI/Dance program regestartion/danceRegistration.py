from os import name
from tkinter import * 

root = Tk()
root.geometry("500x400")
root.title("Dance Competition")
label = Label(root,text="***Provide valid Username or Password",fg="red",font=("",10,"italic"))
def fileInput():
    name = userVar.get()
    pw = passwordVar.get()
    if name=="" or pw=="":
        label.pack()
    else:
        f = open("C:/Users/Lenovo/Desktop/My Notes/Python/Python GUI/Dance program regestartion/regdList.txt",'a')
        f.write("Username: "+name+"\n")
        f.write("Password: "+pw+"\n\n\n")
        userEntry.delete(0,END)
        passwordEntry.delete(0,END)
        label.destroy()
        f.close()

f1 = Frame(root)
f1.pack(fill=X)

l1 = Label(f1,text = "Welcom to our Premium Dance classes\n!!!Fly with us to reach Apex!!!",
fg="black",bg="yellow",font=("Giveny",15,"bold","italic"),pady=10)
l1.pack(fill=X)

l2 = Label(text="Fill the form to Register",pady=20,fg="red",font=("Giveny", 14, "bold"))
l2.pack()

userVar = StringVar()
passwordVar = StringVar()

user = Label(text="Username",font=("",10,"bold"))
userEntry = Entry(root,textvariable=userVar)
password = Label(text="Password",font=("",10,"bold"))
passwordEntry = Entry(root,textvariable=passwordVar)

user.place(x=90,y=150)
userEntry.pack(pady=15)
password.place(x =90 ,y=220)
passwordEntry.pack(pady=35)

btn = Button(root,text="Submit",bg="green",fg="white",font=("",10,"bold"),borderwidth=5,relief=SUNKEN,command=fileInput)
btn.pack(padx=48)

root.mainloop()
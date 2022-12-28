from tkinter import *
from random import randint
from PIL import Image,ImageTk

d = {1:"dice1.png",2:"dice2.png",3:"dice3.png",4:"dice4.png",5:"dice5.png",6:"dice6.png"}

root = Tk()
#About windows 
root.title("Dice Roller!")
root.configure(bg="#f1f3f4")
root.geometry("500x400")

#heading
Label(root,text="Dice Simulator",bg="white",fg="#0097a7",
font="comicsense 17 bold").pack(fill=X)

#default dice
n = randint(1,6)
img = Image.open(d[n])
img = img.resize((300,250))
photo = ImageTk.PhotoImage(img)
l = Label(root,image=photo)
l.pack(pady=20)

#functions
def image_loop():
    n = randint(1,6)
    print(n)
    img = Image.open(d[n])
    img = img.resize((300,250))
    photo = ImageTk.PhotoImage(img)
    l.configure(image=photo)
    l.image = photo
    l.pack(pady=20)

#button
btn = Button(root,text="Try it!",bg="#8bb2f0",fg="red",font = "comicsense 15 bold italic",padx=12,
command=image_loop).pack()




root.mainloop()
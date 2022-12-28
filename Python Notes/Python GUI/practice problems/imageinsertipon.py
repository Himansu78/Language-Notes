from tkinter import *
from PIL import Image,ImageTk


root = Tk()
root.geometry("500x400")
#photo = PhotoImage(file='img.png')
#label = Label(image=photo)
#label.pack()
print(type('background.jpg'))
img = Image.open('background.jpg')
photo = ImageTk.PhotoImage(img)
l = Label(image=photo)
l.pack()

root.mainloop()
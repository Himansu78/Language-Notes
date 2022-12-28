from tkinter import *
from PIL import Image,ImageTk
import os,os.path


path = "C:/Users/Lenovo/Pictures/Mychannel/"

win_root = Tk()
win_root.geometry('500x400')


for f in os.listdir(path):
    f = path+f
    img = Image.open(f)
    img = img.resize((400,300))
    photo = ImageTk.PhotoImage(img)
    
    l = Label(image = photo)
    l.image = photo
    l.pack(side=LEFT,anchor="nw")
    
win_root.mainloop()
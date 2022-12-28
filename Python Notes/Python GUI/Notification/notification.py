from tkinter import *
from plyer import notification
import time
root = Tk()
#function
def send_notification():
    time.sleep(float(timevar.get()))
    notification.notify(title="Message from Himansu",message=messagevar.get(),timeout = 30,toast=False)

root.title("Notification GUI")
root.geometry("420x330")
root.configure(bg="#6da2e4")

#heading 
Label(root,text="# Notification #",bg="yellow",fg="red",font="comicscanse 15 bold",pady=10).grid(row=0,column=1)

messagevar = StringVar()
timevar = StringVar()

Label(text="Enter yout Message: ",bg="#6da2e4",fg="white",pady=40,padx=20,font="comicsanse 8 bold").grid(row=1,column=0)
messageEntry = Entry(root,textvariable=messagevar)
messageEntry.grid(row=1,column=1)

Label(text="Enter time(sec):",bg="#6da2e4",fg="white",pady=10,padx=10,font="comicsanse 8 bold").grid(row=2,column=0)
timeEntry = Entry(root,textvariable=timevar)
timeEntry.grid(row=2,column=1)

btn = Button(text="Submit !",bg="green",fg="white",font="comicsanse 10 bold",
borderwidth=5,relief=SUNKEN,padx=10,command=send_notification)
btn.grid(row=4,column=1)

root.mainloop()
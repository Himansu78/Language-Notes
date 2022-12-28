from tkinter import *  
from PIL import Image, ImageTk
import random 

path = 'C:\\Users\\Lenovo\\Desktop\\My Notes\\Python\\Python GUI\\rock-paper-scissor\\'
d ={1:path+"rock.jpg",2:path+'paper.jpg',3:path+'scissor.jpg'}


global user1_score 
global user2_score
user1_score = 0
user2_score = 0



i=1
#functions
def play():
    global i
    if i<=int(turn.get()):
        i = i+1
        n1 = random.randint(1,3)
        n2 = random.randint(1,3)
        img1 = Image.open(d[n1])
        img2 = Image.open(d[n2])
        img1 = img1.resize((200,200))
        img2 = img2.resize((200,200))
        photo1 = ImageTk.PhotoImage(img1)
        photo2 = ImageTk.PhotoImage(img2)
        l1.configure(image=photo1)
        l1.image = photo1
        l2.configure(image=photo2)
        l2.image = photo2
        l1.pack(pady=10)
        l2.pack(pady=10)
        global user1_score 
        global user2_score
        if n1 == n2:
            print("NULL")
        elif n1==1 and n2==2:
            user2_score +=1
        elif n1==1 and n2==3:
            user1_score +=1
        elif n1==2 and n2==1:
            user1_score +=1
        elif n1==2 and n2==3:
            user2_score +=1
        elif n1==3 and n2==1:
            user2_score+=1
        elif n1==3 and n2==2:
            user1_score += 1
    else:
        Label(root,text=user1.get()+' score: '+str(user1_score),bg='#c25262',font="comicscnce 15 bold").place(x=120,y=400)
        Label(root,text=user2.get()+' score: '+str(user2_score),bg='#c25262',font="comicscnce 15 bold").place(x=500,y=400)
        if user2_score > user1_score:
            Label(root,text='Winner: '+user2.get(),bg='#587fbc',fg="blue",font='comicscanse 15 bold',padx=15,pady=4).place(x=320,y=435)
        elif user1_score > user2_score:
            Label(root,text="Winner: "+user1.get(),bg='#587fbc',fg="blue",font='comicscanse 15 bold',padx=15,pady=4).place(x=320,y=435)
        else:
            Label(root,text='!!Match Tied!!',bg='#587fbc',fg="blue",font='comicscanse 15 bold',padx=15,pady=4).place(x=320,y=435)






root = Tk()


#Window configuration
root.geometry('796x465')
root.title("Rock-Paper-Scissor")
root.configure(bg = '#c25262')

#Heading
Label(root,text="Welcome to the game",fg="red",bg='yellow',
font="comicscanse 20 bold").pack(fill=X)

f = Frame(root)
f.place(x=25,y=43)
x = 0

#warnings
tl = Label(f,text='***Enter number of turns',fg="red",font='comicsense 7 bold italic')

turn = StringVar()
Label(f,text='Number of turn: ',padx=5,fg='white',bg='black').pack(side=LEFT)
turnEntry = Entry(f,textvariable=turn)
turnEntry.pack(side=LEFT)
#turnEntry.bind("<Return>",take)

f3 = Frame(root)
f3.place(x=670,y=43)

print(turn.get())
Label(f3,text='Turn left: '+str(x),padx=5,fg='white',bg='black').pack(side=LEFT)


f1 = Frame(root,borderwidth=10,bg = '#d2afd9',relief=SUNKEN,padx=85,pady=10)
#f1.pack(side=LEFT,anchor='nw',fill=Y,pady=30)
f1.place(x=0,y =65)

f2 = Frame(root,borderwidth=10,bg = '#d2afd9',relief=SUNKEN,padx=85,pady=10)
#f2.pack(side=LEFT,anchor='nw',fill=Y,pady=30)
f2.place(x=400,y=65)

# Images 
img1 = Image.open(d[random.randint(1,3)]) 
img2 = Image.open(d[random.randint(1,3)])
img1 = img1.resize((200,200))
img2 = img2.resize((200,200))
photo1 = ImageTk.PhotoImage(img1)
photo2 = ImageTk.PhotoImage(img2)


l1 = Label(f1,image=photo1)
l1.pack(pady=10)
l2 = Label(f2,image=photo2)
l2.pack(pady=10)

#user name
user1 = StringVar()
user2 = StringVar()

Label(f1,text='Name:',font='comicsense 10 bold',bg = '#d2afd9').pack(side=LEFT,padx=4)
Entry(f1,textvariable=user1).pack()
Label(f2,text='Name:',bg = '#d2afd9',font='comicsense 10 bold').pack(side=LEFT,padx=4)
Entry(f2,textvariable=user2).pack()

btn = Button(root,text='Play',pady=5,padx=15,bg='#1f9bcc',fg="white",font = 'comicsense 10 bold',command=play)
btn.place(x=370,y=355)
root.mainloop()
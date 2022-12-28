class Car:
    def __init__(self,name,model,color):
        self.name = name
        self.model = model
        self.color = color
    def getInfo(self):
        print('Car Name: {} \tModel: {}\t Color: {}'.format(self.name,self.model,self.color))

class Person:
    def __init__(self,name,age):
        self.name = name
        self.age = age
    def eatdrink(self):
        print("Eating and Drinking ")

class Employee(Person):
    def __init_(self,name,age,eno,esal,car):
        super().__init__(name,age)
        self.eno = eno
        self.esal = esal
        self.car = car
    def work(self):
        print('Coding Python Program')
    def empInfo(self):
        print('Name: ',self.name)
        print('Age: ',self.age)
        print('Emp No: ',self.eno)
        print('Emp Sal: ',self.esal)
        print('Employee Car Information: ')
        self.car.getInfo()

car = Car('Audi','A4','Black')
e = Employee('Himansu',20,12345,50000,car)
e.empInfo()

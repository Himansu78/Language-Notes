import cv2 

face_cascade = cv2.CascadeClassifier("haarcascade_frontalface_alt_tree.xml")

img = cv2.imread('C:\\Users\\Lenovo\\Desktop\\My Notes\\Python\\Open CV\\IMG_20190903_112911.jpg',1)

gray_img = cv2.cvtColor(img,cv2.COLOR_BGR2GRAY)

faces = face_cascade.detectMultiScale(image = gray_img, scaleFactor = 1.05, minNeighbors=5)

print(type(faces))
print(faces)
for x, y,z,h in faces:
    img = cv2.rectangle(img,(x,y),(x+w,y+h),(0,255,0),3)

resized = cv2.resize(img,(500,600))
cv2.imshow('Grey',resized)


cv2.waitKey(0)
cv2.destroyAllWindows()


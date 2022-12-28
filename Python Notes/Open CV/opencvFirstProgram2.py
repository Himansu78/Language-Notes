import cv2
img = cv2.imread("C:\\Users\\Lenovo\\Pictures\\Mychannel\\thumblin.jpeg")

croppedimg = img[0:200,200:500]

cv2.imshow("Croped image",croppedimg)
cv2.waitKey(0)
cv2.destroyAllWindows()
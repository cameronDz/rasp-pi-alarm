# Date: 11/20/16
# Program to use Ultrasonic Ranger at port D2

import platform
import sys

from os.path import dirname, abspath
d = dirname(dirname(abspath(__file__)))

if platform.system() == 'Windows':
    sys.path.insert(0, d+'\\GrovePi\\Software\\Python')
else:
    sys.path.insert(0, 'home/pi/Desktop/GrovePi/Software/Python')

import time
from grovepi import *
import grovepi

# Connect the Grove Ultrasonic Ranger to digital port D2
# Connect the button to D3
# Connect the led to D4
ultrasonic_ranger = 4
button = 3
led = 2

# Set up led
pinMode(led,"OUTPUT")
time.sleep(1)

# Set up button
grovepi.pinMode(button, "INPUT")

loop = True

# Loop to warm up ultrasonic sensor so it returns consistent readings
for x in range(0, 10):
    # For testing purposes
    #print("Test: " + str(grovepi.ultrasonicRead(ultrasonic_ranger)))
    x += 1

# Get sample distance for buffer in while loop
prevDistance = grovepi.ultrasonicRead(ultrasonic_ranger)
distance = prevDistance

# Green LED at port D4 on, system armed
digitalWrite(led, 1)

while loop:
    try:
        prevDistance = distance
            
        # Read distance value from Ultrasonic
        distance = grovepi.ultrasonicRead(ultrasonic_ranger)

        if grovepi.digitalRead(button) == 1:
            # Turn off green LED
            digitalWrite(led, 0)
            loop = False
            # Add code for red LED on            

        # Allow slight buffer distance for unintentional movement
        if distance < (prevDistance - 50) or distance > (prevDistance + 50):
                loop = False
                digitalWrite(led, 0)
                print (distance)
                print (prevDistance)
    except TypeError:
        print ("Error")
    except IOError:
        print ("Error")


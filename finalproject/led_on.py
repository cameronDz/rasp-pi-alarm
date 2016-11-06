# Date: 11/6/16
# Program to turn on the LED at port D4

import sys
sys.path.insert(0, '/home/pi/Desktop/GrovePi/Software/Python')

import time
from grovepi import *

# Connect the Grove LED to digital port D4
led = 4

pinMode(led,"OUTPUT")
time.sleep(1)

#Turn on the LED
digitalWrite(led,1)		# Send HIGH to switch on LED

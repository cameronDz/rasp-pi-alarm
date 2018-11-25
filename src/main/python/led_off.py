# Date: 11/6/16
# Program to turn off the LED at port D4

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

separator = "="
keys = {}

with open('config/environment.properties') as f:

    for line in f:
        if separator in line:

            # Find the name and value by splitting the string
            name, value = line.split(separator, 1)

            # Assign key value pair to dict keys
            # strip() removes white space from the ends of strings
            keys[name.strip()] = value.strip()

# Connect the Grove LED to digital port D4
led = int(keys['RED_LED_PORT'])

pinMode(led,"OUTPUT")
time.sleep(1)

#Turn off the LED
digitalWrite(led,0)		# Send HIGH to switch off LED

#!/bin/bash

{
git add *
} &> /dev/null

echo "Enter a commit message"
read message

{
git commit -m "$message"
} &> /dev/null
git push

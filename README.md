# Node JS Application
This is node js sample web application for testing and learning  purpose


# Run w/o dockerfile 
npm init -y
npm install express
node app.js

check on http://localhost:3000/

# Run with docker 
docker build -t node-app .
docker run -p 3000:3000 node-app

![image](https://github.com/user-attachments/assets/5e0bd0e5-dac4-4c80-be73-adc9e453a701)

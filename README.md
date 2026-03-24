proyecto avance
<img width="1074" height="507" alt="image" src="https://github.com/user-attachments/assets/4bc016cd-e7a4-406e-9cc7-152e218b1c11" />

mvn clean package
<img width="1014" height="464" alt="image" src="https://github.com/user-attachments/assets/244935c8-b64b-4d6f-86eb-776cb0c90590" />


mvn spring-boot:run

<img width="1145" height="832" alt="image" src="https://github.com/user-attachments/assets/671aba03-c5ac-4d78-8958-3d5ae8ac45fd" />

http://localhost:8080/lucasseq?value=13


<img width="1079" height="361" alt="image" src="https://github.com/user-attachments/assets/1d35639c-58eb-49c9-9656-ba8893f2f028" />

vamos a intentarlo lanzar
<img width="1846" height="969" alt="image" src="https://github.com/user-attachments/assets/fed0bb55-0b32-4d0f-ac23-5af9da1d797f" />
creamos la instancia 

<img width="1516" height="928" alt="image" src="https://github.com/user-attachments/assets/e2cae3af-b81d-4a35-88b9-43eafa70213a" />

creamos la llave 
<img width="1915" height="767" alt="image" src="https://github.com/user-attachments/assets/e8caaa5a-04c6-4214-a45a-4d2b774611f9" />

las guadamos dentro del proyecto 
<img width="1232" height="689" alt="image" src="https://github.com/user-attachments/assets/5e6c77a1-f48a-4358-978c-ede7543a479a" />

ya se creo la instancia 
<img width="1903" height="835" alt="image" src="https://github.com/user-attachments/assets/2aaf26bb-4f91-4ec5-b702-367bb786ae68" />


nos concetamos por medio de SSH CLIENTE  : ssh -i "key-lucas.pem" ec2-user@ec2-54-89-240-196.compute-1.amazonaws.com

<img width="1129" height="365" alt="image" src="https://github.com/user-attachments/assets/91e83f14-8b94-4f2f-b098-920a7325cfc2" />

Ahora para poder correrlo vamos a tener que hacer unas instalacciones como en los laboratorios anteriores
sudo dnf update -y
sudo dnf install -y java-17-amazon-corretto-devel
java -version
<img width="1203" height="903" alt="image" src="https://github.com/user-attachments/assets/b458a6ca-343f-4edc-84bc-838c53cb43e2" />
<img width="1344" height="932" alt="image" src="https://github.com/user-attachments/assets/69a2aedc-8ba1-43de-bb1c-ed90c72a009f" />

sudo dnf install -y maven
mvn -version

<img width="1130" height="897" alt="image" src="https://github.com/user-attachments/assets/a8ae1729-2069-43a2-87ee-f4e45c75d859" />


ya pudimos correrlo 
<img width="1389" height="917" alt="image" src="https://github.com/user-attachments/assets/4dc17703-8978-4c82-9b2c-eff0cc72fa1b" />

lo probamos en el navegador 
http://ec2-54-89-240-196.compute-1.amazonaws.com:8080/lucasseq?value=13
<img width="1015" height="331" alt="image" src="https://github.com/user-attachments/assets/56754eac-d44f-4f43-8c66-0e6822f3d7d4" />









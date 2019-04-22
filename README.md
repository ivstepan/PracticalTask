Билдим проекты (Carshowroom, CarshowroomRESTclient, CarshowroomSoAPclient)
Для дальнейшей работы необходимо получить Docker image для баз/базы данных ms sql server и/или postgresql

В данном случае рассмотрен пример запуска с MS SQL Server.
Получаем образ SQL Server 2017 Linux из реестра Microsoft при помощи команды:
sudo docker pull mcr.microsoft.com/mssql/server:2017-latest

Создайте volume: docker volume create dbdefault

Для запуска проекта необходимо выполнить команду docker-compose up --build в корне Carshowroom. 
Этой командой мы строим два образа (для REST и SOAP сервисов) и запускаем их в контейнерах, одновременно поднимая в третьем контейнере ms sql server.

Проверяем, что контейнеры запустились и работают: docker ps
Мы должны увидеть 3 запущенных контейнера.

Проверяем инициализацию базы данных:
sudo docker exec -it db "bash" - Подключение оболочки bash внутри запущенного контейнера
/opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P 'QWEzxc!86' - запуск sqlcmd внутри контейнера

Выбираем базу данных:
use tempdb
go

Проверяем наличие заказов в таблице orders
select * from orders
go
Если мы видим 4 созданных заказа, значит всё в порядке.

Для проверки работоспособности клиентов необходимо запустить проекты CarshowroomRESTclient и CarshowroomSoAPclient.
Для взаимодействия с серверной частью используется spring shell.
Запустить клиент SoAP можно через IDE, либо через cmd: java -jar ClientAutoshowroomSoAP-1.0.0.jar (из директории CarshowroomSoAPclient/build/libs)
Для информации о доступных методах в строке shell вводим команду: help

Команда на создание заказа: save -cid 2 -bc Audi -mc A6 -fmp -wtp 
Обновление заказа: update -oid 5 -bc VAZ -mc Granta -ap
Добавление клиента: savecustomer -fn John -ln Doe -e johndoe@gmail.com -bd 22-10-1970
Удаление заказа: delete -id 1
Получить все заказы клиента в определённом статусе: get -cid 4 -s RECEIVED
Получить все заказы: getall

Запустить клиент REST можно через IDE, либо через cmd: java -jar ClientAutoshowroomREST.jar (из директории CarshowroomRESTclient/build/libs)

Создание заказа: save -cid 3 -bc VAZ -mc Kalina -hsp -ap
Обновление заказа: update -oid 5 -bc VAZ -mc Kalina -ap
Удаление заказа: delete -id 3
Добавление клиента: savecustomer -fn Uncle -ln Fedor -e oldmanfedor@gmail.com -bd 23-05-1958
Получить все заказы клиента в определённом статусе: get -cid 4 -s RECEIVED
Получить все заказы: getall
# demo-oauth2
demo oauth2 simple


curl --location --request POST 'http://localhost:8080/oauth/token?grant_type=client_credentials' 

Authorization
type : basic Auth
username : client-service
password : secret


example:

curl --location --request GET 'http://localhost:8080/api/privado' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJhbGwiXSwiZXhwIjoxNjEwNDczNjk3LCJqdGkiOiI1ZGVlNmFhYy1iMDBmLTQ2YmQtODE3ZC03YmQ5ZGI4MmI3Y2QiLCJjbGllbnRfaWQiOiJjbGllbnQtc2VydmljZSJ9.hXbCTkY7SnvP1hL4is812Nj2xOp_anrhLsRm60ZUOJs'

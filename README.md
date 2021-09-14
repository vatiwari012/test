# Url Testing
It's an Basic RestApi program which has Four api's to test. The api's are as follow....
 "http://localhost:8080/storeurl?url={peremeter}" It is used to save URL, into a table with a unique short key and a count(usage Count).
 " http://localhost:8080/get?url={parametert}" ,It  take a URL as a parameter and return the unique short key.
 "http://localhost:8080/count?url={peremeter}", it  take a URL as a parameter and should return the latest usage count
 " http://localhost:8080/list?page=1&size=2" , list should return all URLs and counts, The return value is in JSON.

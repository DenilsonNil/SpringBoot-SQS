### ABOUT THIS PROJECT
This project implements a Amazon SQS Service. 
You can:

- Create a queue
- Send simple and complex message to a queue
- Subscribe a queue in a SNS Topic
- Delete Message
  

### HOW TO USE IT
Open the file application.yml
Provide values for the environment variables below:

- AMAZON_CONFIG_ACCESS_KEY
- AMAZON_CONFIG_SECRET_KEY
- AMAZON_CONFIG_REGION
- AMAZON_TOPIC_ARN

Run the application

### CURL

## Create a queue

```curl
curl --location 'localhost:8080/api/v1/queues/create/Queue_name'
```

## Send a simple text message
```curl
curl --location 'localhost:8080/api/v1/queues/sendMessage' \
--header 'Content-Type: application/json' \
--data '{
    "queueUrl": "QUEUE_URL",
    "messageBody": "YOUR_MESSAGE"
}'
```

## Send a complex message
```curl
curl --location 'localhost:8080/api/v1/queues/complexMessage' \
--header 'Content-Type: application/json' \
--data '{
    "queueUrl": "QUEUE_URL"
}'
```

## Subscribe to one specific SNS topic
```curl
  curl --location 'localhost:8080/api/v1/queues/subscribe' \
--header 'Content-Type: application/json' \
--data '{
    "queueArn": "QUEUE_ARN"
}'
```

## Receive Messages from a queue
```curl
curl --location --request GET 'localhost:8080/api/v1/queues/receiveMessages' \
--header 'Content-Type: application/json' \
--data '{
    "queueUrl": "https://sqs.us-east-1.amazonaws.com/000249833221/Kualit-queue-1"
}'
```

## Delete Message
```curl
curl --location --request GET 'localhost:8080/api/v1/queues/deleteMessage' \
--header 'Content-Type: application/json' \
--data '{
    "receiptHandle": "MESSAGE_RECEIPT_HANDLER",
    "queueUrl": "QUEUE_URL"
}'
```



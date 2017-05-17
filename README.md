# truncatelog
Run the Spring boot application (TruncateLogDemoApplication)
Open browser to send rest get request, with orderDetails and maxLength as  request parameters
URL : http://localhost:8080/subscribe?orderDetails=123456789012345678901234567890&maxLength=25
->produces output  "12 ... (truncated) ... 90"

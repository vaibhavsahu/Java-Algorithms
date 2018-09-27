Imagine that you work for Company X that has developed an amazing robot.
This robot is equipped with a pair of mechanical arms and a camera.
When a Websters Unabridged English Dictionary is placed in front of the robot,
the robot is capable of turning the dictionary’s pages forward and backward,
and moving its camera to view the terms and definitions on the current page of the dictionary.
The robot is also capable of jumping directly to the first or last page of the dictionary,
and it is capable of jumping directly to the first or last term on the current page of the dictionary.

Your company has created an API for controlling these robots.
Your task, should you choose to accept it,
is to create a web application using any combination of JAVA,
Go, Node.JS, Angular or React that, given a term, finds and outputs the definition for that term.
You can take the time you need to complete this assignment, typically we have submissions within the week.
Be prepared to discuss any parts of your solution,
be prepared to discuss any assumptions you made while completing this assignment,
and be prepared to discuss additional changes or improvements to your solution
or to the API that you would have liked to have made to improve your solution.
When you are finished, please upload the code for your solution here: goo.gl/9jCgSS.


Helpful hints:
•	The base URL for your company’s API’s is https://oke5yaeave.execute-api.us-west-2.amazonaws.com/prod. 
•	You will need an API key to execute calls to the REST API.
Your API key is XZA0ZDaayc544Z5nVvS499MG5Vw38i0u4mni9vH8, and should be included in the “x-api-key” header of each request. 

•	Throttling and quotas are enabled for your API key.
Requests are throttled to bursts of 1000 requests, with a refill rate of 200 requests per second.
There is a quota/limit of 100,000 requests per API key per day.
Please let us know if you encounter any issues with rate limiting. 

•	For reference, here is a link to the Swagger spec and visual explorer for your company’s
REST API: https://app.swaggerhub.com/apis/InMoment/challenge-robot/1.0.0. 

•	When you make your first request to the API, a robot will be “checked-out” for your exclusive use for 7 days.
At the end of your robot’s allotted time, your robot will be released back into the pool of available robots. 

•	After your robot is released, you may check out a new robot by issuing another request to the API. 
•	For reference, the dataset that the robot API is using was derived from this GitHub repository: 
https://github.com/adambom/dictionary. All terms beginning with ‘-‘ were removed from the dataset,
and the terms were sorted lexicographically using an online JSON sorter.


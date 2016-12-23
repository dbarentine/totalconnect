# TotalConnect Library
Java Library to connect to the Honeywell TotalConnect Soap API

The actual client lib was generated using wsimport. The WSDL was taken from https://rs.alarmnet.com/TC21API/TC2.asmx?WSDL and had to be tweaked to remove the soapenc:Array element.

The command used to generate it was:
wsimport -d generated -extension -keep -p com.barentine.totalconnect.ws -XadditionalHeaders D:\Source\totalconnect\src\main\java\resources\TC2.wsdl

The resulting SvcTC2API.java file was then tweaked to load the WSDL file from Java resources.

It can be used by using the wrapper class TotalConnect. The following is an example of arming the system through the API.

```java
TotalConnect tc = new TotalConnect();
SessionDetailResults auth = tc.authenticate(credentials.getUserName(), credentials.getPassword());
LocationInfoBasic location = tc.getLocation(auth, locationName);
ArmSecuritySystemResults rc = tc.getSoapApi().armSecuritySystem(auth.getSessionID(), location.getLocationID(), location.getSecurityDeviceID(), armType.getValue(), -1);
tc.logout(auth.getSessionID());
```

**Note: This API is undocumented and unsupported. Don't expect any help from Honeywell if something doesn't work.**

# Rest API

I've built a simple rest API that takes a TotalConnect user login and then will arm the system. The API is built using the Spark framework (http://sparkjava.com/) and runs just like a normal Java console app.

For those curious why I wrapped their API with my own the answer is because my home automation controller can only make a simple Http call and so it couldn't handle the authentication needed. So by wrapping it in a restful api that takes basic authentication My ISY994i controller can make a single http call and arm the security system as part of a program. This could also be used with something like the IFTTT maker channel for arming the system via Amazon Echo or any number of integrations.

# Building and Running

Requires Maven and Java 8.

To build just run: mvn clean package

It will copy all the dependencies into <sourceDir>/api/target

From there you should just need to run the main class: com.barentine.api.Application

# Other Notes

For me this all runs internally on my home network behind a firewall. If you were to expose this to the internet for things like IFTTT it should be protected using SSL to protect your TotalConnect credentials. **If your credentials were compromised then whomever had them could easily disarm your system. So use it carefully so you don't compromise your alarm system.**

It's licensed under the Apache 2.0 License. This software is supplied "AS IS" without any warranties and support and I assume no responsibility or liability for the use of the software, conveys no license or title under any patent, copyright, or mask work right to the product.
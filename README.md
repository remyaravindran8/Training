# SAP S/4HANA Cloud Extensions - Product Web Ordering application
This repository contains the sample code for the web product-ordering app from [SAP S/4HANA Cloud Product Web Ordering and Reporting tutorial](http://tiny.cc/s4-ext-order-app).

*This code is only one part of the tutorial, so please follow the tutorial before attempting to use this code.*

## Description

The [SAP S/4HANA Cloud Product Web Ordering and Reporting tutorial](http://tiny.cc/s4-ext-order-app) showcases an extension to an SAP S/4HANA Cloud system. With this simple product-ordering app, your customers can display and order products. One-time customers can buy available products without having to register first.

#### SAP Extensibility Explorer

This tutorial is one of multiple tutorials that make up the [SAP Extensibility Explorer](https://sap.com/extends4) for SAP S/4HANA Cloud.
SAP Extensibility Explorer is a central place where anyone involved in the extensibility process can gain insight into various types of extensibility options. At the heart of SAP Extensibility Explorer, there is a rich repository of sample scenarios which show, in a hands-on way, how to realize an extensibility requirement leveraging different extensibility patterns.


Requirements
-------------
- An account in SAP Cloud Platform with a subaccount in the Neo environment and an SAP Cloud Platform Java server of any size.
- An SAP S/4HANA Cloud tenant. **This is a commercial paid product.**
- [Java SE 8 Development Kit (JDK)](https://www.oracle.com/technetwork/java/javase/downloads/index.html) and [Apache Maven](http://maven.apache.org/download.cgi) to build the application.

Download and Installation
-------------
This repository is a part of the [Download the Sample Application](https://help.sap.com/viewer/4316f97a90ff48948fb7f212ecabf964/SHIP/en-US/5d24945c0a3142f490a9582a7d8b19f7.html) step in the tutorial. Instructions for use can be found in that step.

[Please download the zip file by clicking here](https://github.com/SAP/s4hana-ext-order-app/archive/master.zip) so that the code can be used in the tutorial.


Known issues
---------------------
If you are working with an SAP Cloud Platform _Trial_ account, you must add the following 2 properties to the destination so that the connection to SAP S/4HANA Cloud works:
```
proxyHost = proxy-trial.od.sap.biz
proxyPort = 8080
```

How to obtain support
---------------------
If you have issues with this sample, please open a report using [GitHub issues](https://github.com/SAP/s4hana-ext-order-app/issues).

License
-------
Copyright © 2019 SAP SE or an SAP affiliate company. All rights reserved.
This file is licensed under the SAP Sample Code License except as noted otherwise in the [LICENSE file](LICENSE).

# Hadoop
## Table of contents
* [Introduction](##Introduction)
* [Hadoop Cluster](##HadoopCluster)
* [Hive Project](##HiveProject)
* [Improvements](##Improvements)

## Introduction
In this project as part of the data analytics team to process data using Apache Hadoop, I was responsible for:
- Evaluating different tools, specifically MapReduce, HDFS, and YARN,
- Provisioning a Hadoop cluster through Google Cloud Platform (GCP),
- and performing data optimizations/analytics using Apache Hive and Zeppelin Notebook.

Hadoop provides a software framework for distributed storage and processing of big data using the MapReduce framework. It utilizes HDFS (Hadoop Distributed File System) which ensures fault tolerance and high availability. Sample queries were performed using Apache Hive on sample data and recorded in a Zeppelin notebook. The 2016 World Development Indicators dataset was the dataset of choice in the project. 

## Hadoop Cluster
![](./assets/clusterDiagram.png)
The Hadoop cluster contains 3 nodes, 1 master and 2 workers. All 3 nodes have the same hardware specifications: 2 vCPUs, 13GB RAM and 100GB of storage. The dataset was imported to GCP Storage of the same project to provide access to it from the cluster.

### HDFS
HDFS is a distributed file system that handles large data sets running on commodity hardware. It is used to scale a single Apache Hadoop 
cluster to hundreds (and even thousands) of nodes.

### YARN
YARN allows the processing and running of data for batch processing, stream processing, interactive processing, and graph processing which are stored in HDFS. The Resource manager in the master node is the master daemon of YARN and is responsible for resource assignment and management among all the applications. Whenever it receives a processing request, it forwards it to the corresponding node manager and allocates resources for the completion of the request accordingly. The node manager in each worker node takes care of individual nodes on the Hadoop cluster and manages application and workflow and that particular node. Its primary job is to keep up with the Node Manager.

### MapReduce
MapReduce is a programming paradigm that enables massive scalability across hundreds or thousands of servers in a Hadoop cluster. The term refers to two separate and distinct tasks that Hadoop programs perform. The first is the map job, which takes a set of data and converts it into another set of data, where individual elements are broken down into tuples (key/value pairs). The reduce job takes the output from a map as input and combines those data tuples into a smaller set of tuples. MapReduce is the original programming paradigm and execution engine that was introduced with Hadoop; however, more efficient execution engines derived from MapReduce have emerged (Tez, Spark, Giraph, Impala, etc.) and can be run on top of YARN instead of MapReduce.

### Hive
Hive is a data warehouse framework that runs on top of Hadoop HDFS and YARN and offers an SQL-like query language (HiveQL/HQL) that can process large datasets stored in HDFS. Hive converts HQL queries to MapReduce (or Tez, Spark, etc.) jobs, which process data residing on HDFS; therefore, Hive does not store the actual data; instead, it uses a Metastore to manage metadata in an RDBMS of choice.

### Zeppelin

Zeppelin is a web-based notebook for us to run Hive queries and visualize the output data. Apache Zeppelin interpreter concept allows any language/data-processing-backend to be plugged into Zeppelin (Markdown, HiveQL, SparkSQL, Bash, etc.). It connects to the Hive service through JDBC


## Hive Project
The purpose of this project was to evaluate Hive as a big data tool. Using Zeppelin notebook I was able to compare Hive query performance 
to both Bash script and Spark queries. In addition to this I performed partitioning and columnar file formats to increase the efficiency of 
the queries.
![](./assets/zeppelinNotebook.png)

## Improvements
- Deploy a larger cluster to improve performance and reliability.
- Explore more into Spark and Tez for performance comparisons.
- Examine performance between different datasets and joining techniques.

Configuration conf = new Configuration();

/* Build MiniDFSCluster */
MiniDFSCluster miniDFS = new MiniDFSCluster.Builder(conf).build();

/* Build MiniMR Cluster */
System.setProperty("hadoop.log.dir", "/path/to/hadoop/log/dir"); // MAPREDUCE-2785
int numTaskTrackers = 1;
int numTaskTrackerDirectories = 1;
String[] racks = null;
String[] hosts = null;
miniMR = new MiniMRCluster(numTaskTrackers, miniDFS.getFileSystem().getUri().toString(),
                           numTaskTrackerDirectories, racks, hosts, new JobConf(conf));

/* Set JobTracker URI */
System.setProperty("mapred.job.tracker", miniMR.createJobConf(new JobConf(conf)).get("mapred.job.tracker"));
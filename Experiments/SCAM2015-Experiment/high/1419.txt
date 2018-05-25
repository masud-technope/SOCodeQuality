ObjectListing listing = s3.listObjects( bucketName, prefix );
List<S3ObjectSummary> summaries = listing.getObjectSummaries();

while (listing.isTruncated()) {
   listing = s3.listNextBatchOfObjects (listing);
   summaries.addAll (listing.getObjectSummaries());
}
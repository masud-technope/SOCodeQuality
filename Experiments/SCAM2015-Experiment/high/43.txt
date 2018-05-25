InputStream is1 = new FileInputStream("/tmp/foo");
try{

    InputStream is2 =  new FileInputStream("/tmp/bar");
    try{
         /* do stuff with is1 and is 2 */

    } finally {
        is2.close();
    }
} finally {
    is1.close();
}
Object $sync = o;
$sync.lock();
try {
    byte[] data1 = new byte[size];
} finally {
    $sync.unlock();
}
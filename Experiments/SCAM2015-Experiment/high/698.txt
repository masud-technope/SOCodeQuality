POST /upload.php HTTP/1.1
Transfer-Encoding: chunked
Content-Type: multipart/form-data; boundary=SeXc6P2_uEGZz9jJG95v2FnK5a8ozU8KfbFYw3
Host: thehost.com
Connection: Keep-Alive
User-Agent: Apache-HttpClient/4.1-alpha2 (java 1.5)

--SeXc6P2_uEGZz9jJG95v2FnK5a8ozU8KfbFYw3
Content-Disposition: form-data; name="uploadedFile"; filename="someXml.xml"
Content-Type: text/xml
Content-Transfer-Encoding: binary

<someXml />
--SeXc6P2_uEGZz9jJG95v2FnK5a8ozU8KfbFYw3
Content-Disposition: form-data; name="otherPart"
Content-Type: text/plain; charset=UTF-8
Content-Transfer-Encoding: 8bit

yo
--SeXc6P2_uEGZz9jJG95v2FnK5a8ozU8KfbFYw3
Content-Disposition: form-data; name="foo"; filename="foo.txt"
Content-Type: text/plain
Content-Transfer-Encoding: binary

Contents of foo.txt

--SeXc6P2_uEGZz9jJG95v2FnK5a8ozU8KfbFYw3--
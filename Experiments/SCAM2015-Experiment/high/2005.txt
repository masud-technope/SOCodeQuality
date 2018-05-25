jclass cls = env->GetObjectClass(obj);

// First get the class object
jmethodID mid = env->GetMethodID(cls, "getClass", "()Ljava/lang/Class;");
jobject clsObj = env->CallObjectMethod(obj, mid);

// Now get the class object's class descriptor
cls = env->GetObjectClass(clsObj);

// Find the getName() method on the class object
mid = env->GetMethodID(cls, "getName", "()Ljava/lang/String;");

// Call the getName() to get a jstring object back
jstring strObj = (jstring)env->CallObjectMethod(clsObj, mid);

// Now get the c string from the java jstring object
const char* str = env->GetStringUTFChars(strObj, NULL);

// Print the class name
printf("\nCalling class is: %s\n", str);

// Release the memory pinned char array
env->ReleaseStringUTFChars(strObj, str);
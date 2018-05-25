String result = "";

for (int i = 0; i < str.length(); i += 4) {
result += str.substring(i, Math.min(str.length(), i + 2));          
}

return result;
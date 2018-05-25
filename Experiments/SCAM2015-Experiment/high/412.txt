query = ("insert into birthtable (nameCol, familyCol, fatherNameCol, mNameCol, dOfBirthCol, pOfBirthCol, inputCol) VALUES(?,?,?,?,?,?,?)");
        pstmt = (PreparedStatement) conn.prepareStatement(query);
        pstmt.setString(1, name);
        pstmt.setString(2, family);
        pstmt.setString(3, fatherName);
        pstmt.setString(4, mName);
        pstmt.setString(5, dOfBirth);
        pstmt.setString(6, pOfBirth);
        // Method used to insert a stream of bytes
        pstmt.setBinaryStream(7, input);
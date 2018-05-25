PreparedStatement st = con.prepareStatement("update schedule set date='"+date+"',stime='"+stime+"',etime='"+etime+"',hall='"+hall+"',loc='"+loc+"' where dept='"+dept+"' and code='"+code+"' ");

      int result=st.executeUpdate();
      if(result==1)            
             fwd="success";
       else
             fwd="fail";
       return(fwd);
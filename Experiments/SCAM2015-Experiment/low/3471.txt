$.ajax({

            type: "POST",
            url : actionurl,
            data:   JSON.stringify(json),
            dataType: "json",
            success: function(response){
                // we have the response
                if(response.status == "SUCCESS"){
                    $('#info').html("Success........!Request has been added......... ");

                }else{
                    $('#info').html("Sorry, there is some thing wrong with the data provided.");
                }
            },
            error: function(e){
                alert('Error: ' + e);
            }
        });
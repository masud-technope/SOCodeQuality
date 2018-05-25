//Render the textures with the normal colors 
spriteBatch.begin();
spriteBatch.draw(sprite1,sprite2,sprite3...);//or whatever code u use to render them
spriteBatch.end();

//Render the textures with the shader
spriteBatch.setShader(shaderWhiteTexture);
spriteBatch.begin();
spriteBatch.draw(sprite4,sprite5,sprite6...);//or whatever code u use to render them
spriteBatch.end();
spriteBatch.setShader(defaultShader);
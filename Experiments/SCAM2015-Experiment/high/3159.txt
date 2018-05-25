varying vec4 v_color;
varying vec2 v_texCoords;
uniform sampler2D u_texture;
void main() {
    vec4 color=v_color * texture2D(u_texture, v_texCoords);

    if(color.r!=0 && color.g!=0 && color.b!=0){
        gl_FragColor=vec4(1,1,1,1);
    }
    else{
        gl_FragColor=color;
    }
}
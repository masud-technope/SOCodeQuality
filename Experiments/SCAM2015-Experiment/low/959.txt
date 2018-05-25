<target name="expand_classpath">
    <script language="javascript"><![CDATA[
        // the original classpath
        var ocp = java.lang.System.getenv("CLASSPATH");
        //  ... split in parts
        var ocp_parts = ocp.split(project.getProperty("path.separator"));

        // where our individual jar filenames go,
        //  together with pure directories from ocp_parts
        var expanded_parts = [ ];

        for each (var part in ocp_parts) {
            if (part.endsWith('*')) {
                var dir = part.substring(0, part.length() - 1);
                var f = new java.io.File(dir);

                // don't know how to construct a java.io.FilenameFilter,
                //  therefore filter the filenames manually
                for each (var file in f.listFiles())
                    if (file.getPath().endsWith('.jar'))
                        expanded_parts.push(file.getPath());
            } else
                expanded_parts.push(part);
        }

        var expanded = expanded_parts.join(project.getProperty("path.separator"));
        project.setProperty("classpath.expanded", expanded);
    ]]></script>

    <!-- <echo message="classpath.expanded = ${classpath.expanded}" /> -->
</target>

<target name="build" depends="expand_classpath">
    <mkdir dir="${obj}" />

    <javac srcdir="${src}" destdir="${obj}"
        classpath="${classpath.expanded}"
        includes="**/*.java"
        excludes="**/package-info.java **/deprecated/*.java"
        includeAntRuntime="no" includeJavaRuntime="no"
        debug="true" debuglevel="source,lines"
    >
        <compilerarg value="-Xlint"/>
        <compilerarg value="-Xlint:-fallthrough"/>
    </javac>
</target>
package softone

import com.softone.person.Operator

class BootStrap {

    def init = { servletContext ->
        importData()
        new Operator(name:"The Stand",enabled:true).save()
        new Operator(name:"Claro",enabled:true).save()
        new Operator(name:"Personal",enabled:true).save()
    }
    def importData={
        Class.getResourceAsStream('/data' + File.separator + 'StudyLevel.csv').eachLine { String line ->
            def row = line.split(";")
            String name = row[1]
            StudyLevel p = StudyLevel.findByName(name.trim())
            if (!p) {
                p = new StudyLevel(name: row[1].trim(), code: Integer.parseInt(row[0]))
                p.save(flush: true)
            }

        }
    }
    def destroy = {
    }
}
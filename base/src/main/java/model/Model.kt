package model

data class Model(var id: Int, var name: String, var age: Int) {
// declare [data] before class to tell vm: it will be used to a data model. it will be override a special 'toString' method.
    override fun toString(): String {
        return "Model(id=$id, name='$name', age=$age)"
    }


}
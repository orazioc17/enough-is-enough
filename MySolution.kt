object EnoughIsEnough {
  fun deleteNth(elements:IntArray, maxOcurrences:Int):IntArray {
    var map = mutableMapOf<Int, Int>()
    var list = mutableListOf<Int>()
    var aux: Int
    elements.forEach { element: Int ->
        aux = 0
        if (map.keys.contains(element)) {
            if (map[element]!! < maxOcurrences) {
                aux = map[element]!!
                aux++
                map[element] = aux
                list.add(element)
            }
        } else if (maxOcurrences > 0){
            map[element] = 1
            list.add(element)
        }
    }
    
    return list.toIntArray()
  }
}

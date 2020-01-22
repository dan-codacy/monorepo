module.exports = function(input) {
    let output = ''
    if(input % 3 === 0) 
        output += 'Bizz'
    if(input % 5 === 0) 
        output += 'Buzz'

    return output.length > 0 ? output : input
}
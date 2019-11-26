/*
 * This function isSummer takes in three parameters and returns a boolean to 
 * indicate whether or not it is summer.  This is based on the date and the hemisphere. 
 *
 * @param {number} month
 * @param {number} [day=1]
 * @param {String} [hemisphere= 'northern'] 
 * @returns {boolean} whether or not it is summer
 */

function isSummer(month, day = 1, hemisphere = 'northern') {
  if (month === 7 || month === 8) {
    return hemisphere === 'northern';
  } else if (month === 6 && day >= 20) {
    return hemisphere === 'northern';
  } else if (month === 9 && day <= 20) {
    return hemisphere === 'northern';
  } else if (month === 1 || month === 2) {
    return hemisphere === 'southern';
  } else if (month === 12 && day >= 20) {
    return hemisphere === 'southern';
  } else if (month === 3 && day <= 20) {
    return hemisphere === 'southern';
  } else {
    return false;
  }
}

/**
 * Write a function called isAdmitted. It will check entrance
 * scores and return true if the students is admitted and
 * false if rejected. It takes three parameters:
 *
 *     * gpa
 *     * satScore (optional)
 *     * recommendation (optional)
 *
 * We admit them--return true--if:
 * gpa is above 4.0 OR
 * SAT score is above 1300 OR
 * gpa above 3.0 and they have a recommendation OR
 * SAT score is above 1200 and they have a recommendation
 * OTHERWISE reject it
 *
 * @param {number} gpa the GPA of the student, between 4.2 and 1.0
 * @param {number} [satScore=0] the student's SAT score
 * @param {boolean} [recommendation=false] does the student have a recommendation
 * @returns {boolean} true if they are admitted
 */
    function isAdmitted(gpa, satScore=0, recommendation=false){
        if(gpa > 4.0 || satScore > 1300){
          return true; 
        } else if (gpa > 3.0 && recommendation === true){
          return true;
        } else if (satScore > 1200 && recommendation === true){
          return true; 
        }

        return false; 
    }
/**
 * Write a function called useParameterToFilterArray so that it takes an anonymous
 * function and uses that in `unfilteredArray` filter function. Return the result.
 *
 * @param {function} filterFunction the function to filter with
 * @returns {number[]} the filtered array
 */
  let unfilteredArray = [1, 2, 3, 4, 5, 6];

  function useParameterToFilterArray(filterFunction){
      return unfilteredArray.filter(filterFunction); 
  }

/**
 * Write a function called makeNumber to take two strings
 * of digits, concatenate them together, and then return
 * the value back as a number.
 *
 * So if two strings are passed in "42293" and "443", then this function
 * should return the number 42293443.
 *
 * @param {string} first the first string of digits to concatenate
 * @param {string} [second=''] the second string of digits to concatenate
 * @returns {number} the resultant number
 */

  function makeNumber(first, second=''){
      let stringTogether = first + second; 
      let num = parseInt(stringTogether, 10);

      return num; 
  }

/**
 * Write a function called addAll that takes an unknown number of parameters
 * and adds them all together. Return the result.
 *
 * @param {...number} num a series of numbers to add together
 * @returns {number} the sum of all the parameters (or arguments)
 */
    function addAll(){
      let num = Array.from(arguments);

      if(num.length === 0){
        return 0; 
      } 

     return num.reduce((sum, currentValue) => sum + currentValue); 
  
    }
/*
 * function makeHappy that takes in an array and prepends 'Happy ' to the beginning of all the
 * words and returns them as a new array. Uses the `map` function.
 * 
 *  @param {String[]} arr
 * @returns {String[]} the new array with 'Happy ' in front of each word
 */

    function makeHappy(arr){
     return arr.map(word => 'Happy ' + word); 
    }


/*
 * Function getFullAddressesOfProperties
 * Takes in an array of Objects and returns a String array 
 * The array of Objects contains the following keys: 
 *     * streetNumber
 *     * streetName
 *     * streetType
 *     * city
 *     * state
 *     * zip
 *
 * String array that is returned should be in this form: 
 *     streetNumber streetName streetType city state zip
 * 
 * @param {Object[]} num a series of numbers to add together
 * @returns {String[]} the sum of all the parameters (or arguments)
 */
    function getFullAddressesOfProperties(arr){
        
        return arr.map(object => {
          return  object.streetNumber + ' ' + object.streetName + ' ' + 
                  object.streetType + ' ' + object.city + ' ' + object.state + ' ' + object.zip
        }); 

    }

 /**
 * Function findLargest takes in an array and returns the largest number or string in that array
 * Largest strings are strings that start with the letter of the alphabet that 
 * is closest to 26 (Z)
 *
 * @param {number[] or String[]} arr
 * @returns {number or String} the largest element in that array 
 * EXAMPLES: 
 *      findLargest(['aardvark', 'zebra', 'mongoose', 'hippo']) returns 'zebra'
 *      findLargest([1, 3, 5, 2, 4, 7, 6])   returns 7
 */

    function findLargest(arr){
      let largest = null; 
        arr.forEach(item => {
            if(largest === null){
              largest = item; 
            } else if(item > largest){
              largest = item; 
            }
        });
        
        return largest; 
    }


/*
 * CHALLENGE
 * Create and document a function called getSumOfSubArrayValues.
 *
 * Take an array of arrays and add up all sub values and return
 * the sum. For instance, if you got this array as a parameter:
 * [
 *   [1, 2, 3],
 *   [2, 4, 6],
 *   [5, 10, 15]
 * ];
 *
 * You would return 48. To do this, you will use two nested `reduce`
 * calls with two anonymous functions.
 *
 * Read the tests to verify you have the correct behavior.
 */

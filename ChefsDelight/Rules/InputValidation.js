export default function InputValidation(charLength) {
//The following evaluateTargetPath will retrieve the current value of the Main dishcontrol
if((charLength.evaluateTargetPath('#Control:FCMainDish/#Value').length) > 25){

//If main dish value is more than 25 chars, a validation failure message to the end-user
  charLength.executeAction('/ChefsDelight/Actions/ValidationFailure.action');
  } else {
//If char length is less than 25 in the main dish value, return true to indicate validation is successful
   return true;
  }
}  
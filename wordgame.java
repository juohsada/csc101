
var wordLetters		= ['G', 'O', 'A', 'T'];
var guessedLetters	= ['_', '_', '_', '_'];
var maxGuesses		= 10;
var input	= ['A','B','C','D','E','F','G','H','I','J'];
var goodGuess;
var moreToGuess;

function guessLetter(input) {
	for (var guessNumber = 0; guessNumber < maxGuesses; guessNumber++){
		goodGuess = false;
		moreToGuess = false;
	for (var i = 0; i < wordLetters.length; i++) {
		if (wordLetters[i] == input[guessNumber]) {
			guessedLetters[i] = input[guessNumber];
			goodGuess = true;
		}
		if (guessedLetters[i] == '_') {
			moreToGuess = true;
		}
	}
	if (goodGuess) {
		console.log('You guessed the right letter!');
		console.log(guessedLetters.join(''));
		if (!moreToGuess) {
			console.log('You WIN the GAME!');
		}
	} else {
		console.log('You guessed wrong...');
	}
	} if (moreToGuess)
		console.log('You have used all your guesses!')
}

guessLetter(input);


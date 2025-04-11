import 'package:english_words/english_words.dart';
import 'package:flutter/foundation.dart';

class MyAppState extends ChangeNotifier {
 var wordpair = WordPair.random();
 var favorites = <WordPair>[];

 void next() {
  wordpair = WordPair.random();
  notifyListeners();
 }

  void toggleFavorite(WordPair selected) {
    if (favorites.contains(selected)) {
      favorites.remove(selected);
    } else {
      favorites.add(selected);
    }
    notifyListeners();
  }
}

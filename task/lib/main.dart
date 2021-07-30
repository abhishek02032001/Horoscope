import 'package:flutter/material.dart';
import 'package:task/view/home.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Task",
      debugShowCheckedModeBanner: false,
      home: Home(),
    );
  }
}

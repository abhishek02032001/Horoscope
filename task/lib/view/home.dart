import 'package:flutter/material.dart';

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,
      body: Container(
        decoration: BoxDecoration(
          image: DecorationImage(
            image: AssetImage("assets/background.png"),
            fit: BoxFit.cover,
          ),
        ),
        child: Padding(
          padding: EdgeInsets.only(left: 50.0, right: 50.0),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.end,
            children: [
              Padding(
                padding: EdgeInsets.only(top: 30.0),
                child: Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Image(
                      image: AssetImage("assets/path.png"),
                    ),
                    Container(
                      child: Row(
                        children: [
                          Image(
                            image: AssetImage("assets/group.png"),
                          ),
                          SizedBox(width: 40.0),
                          Image(
                            image: AssetImage("assets/menu.png"),
                          ),
                        ],
                      ),
                    ),
                  ],
                ),
              ),
              Expanded(
                child: Container(
                  width: (MediaQuery.of(context).size.width / 2.5) - 50.0,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Text(
                        "VERIFICATION MADE EASY",
                        style: TextStyle(fontSize: 50.0, color: Colors.white),
                      ),
                      SizedBox(height: 30.0),
                      Text(
                        "DOMINEUM CREDENTIAL VERIFICATION SYSTEM IS A 3 SIDED MARKETPLACE DESIGNED TO BRIDGE THE ONLINE AND OFFLINE WORLDS FOR SHARING VERIFIABLE DOCUMENTS AND CREDENTIALS BETWEEN ISSUING INSTITUTIONS, BUSINESSES/INDIVIDUALS AND 3RD PARTY VERIFIERS.",
                        style: TextStyle(fontSize: 15.0, color: Colors.white),
                      ),
                      SizedBox(height: 30.0),
                      Image(
                        image: AssetImage("assets/button.png"),
                      ),
                    ],
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

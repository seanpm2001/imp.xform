
////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2007 IBM Corporation.
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
//Contributors:
//    Philippe Charles (pcharles@us.ibm.com) - initial API and implementation

////////////////////////////////////////////////////////////////////////////////

package org.eclipse.imp.xform.pattern.parser;

public interface ASTPatternLexersym {
    public final static int
      Char_CtlCharNotWS = 101,
      Char_LF = 87,
      Char_CR = 88,
      Char_HT = 13,
      Char_FF = 69,
      Char_a = 14,
      Char_b = 15,
      Char_c = 16,
      Char_d = 17,
      Char_e = 18,
      Char_f = 19,
      Char_g = 20,
      Char_h = 21,
      Char_i = 22,
      Char_j = 23,
      Char_k = 24,
      Char_l = 25,
      Char_m = 26,
      Char_n = 27,
      Char_o = 28,
      Char_p = 29,
      Char_q = 30,
      Char_r = 31,
      Char_s = 32,
      Char_t = 33,
      Char_u = 34,
      Char_v = 35,
      Char_w = 36,
      Char_x = 37,
      Char_y = 38,
      Char_z = 39,
      Char_A = 40,
      Char_B = 41,
      Char_C = 42,
      Char_D = 43,
      Char_E = 44,
      Char_F = 45,
      Char_G = 46,
      Char_H = 47,
      Char_I = 48,
      Char_J = 49,
      Char_K = 50,
      Char_L = 51,
      Char_M = 52,
      Char_N = 53,
      Char_O = 54,
      Char_P = 55,
      Char_Q = 56,
      Char_R = 57,
      Char_S = 58,
      Char_T = 59,
      Char_U = 60,
      Char_V = 61,
      Char_W = 62,
      Char_X = 63,
      Char_Y = 64,
      Char_Z = 65,
      Char_0 = 1,
      Char_1 = 2,
      Char_2 = 3,
      Char_3 = 4,
      Char_4 = 5,
      Char_5 = 6,
      Char_6 = 7,
      Char_7 = 8,
      Char_8 = 9,
      Char_9 = 10,
      Char__ = 70,
      Char_AfterASCII = 102,
      Char_Space = 66,
      Char_DoubleQuote = 89,
      Char_SingleQuote = 71,
      Char_Percent = 90,
      Char_VerticalBar = 72,
      Char_Exclamation = 73,
      Char_AtSign = 91,
      Char_BackQuote = 92,
      Char_Tilde = 93,
      Char_Sharp = 94,
      Char_DollarSign = 95,
      Char_Ampersand = 96,
      Char_Caret = 97,
      Char_Colon = 74,
      Char_SemiColon = 75,
      Char_BackSlash = 76,
      Char_LeftBrace = 77,
      Char_RightBrace = 78,
      Char_LeftBracket = 79,
      Char_RightBracket = 80,
      Char_QuestionMark = 98,
      Char_Comma = 81,
      Char_Dot = 11,
      Char_LessThan = 99,
      Char_GreaterThan = 82,
      Char_Plus = 83,
      Char_Minus = 12,
      Char_Slash = 67,
      Char_Star = 84,
      Char_LeftParen = 85,
      Char_RightParen = 86,
      Char_Equal = 68,
      Char_IDENT = 103,
      Char_EOF = 100;

    public final static String orderedTerminalSymbols[] = {
                 "",
                 "0",
                 "1",
                 "2",
                 "3",
                 "4",
                 "5",
                 "6",
                 "7",
                 "8",
                 "9",
                 "Dot",
                 "Minus",
                 "HT",
                 "a",
                 "b",
                 "c",
                 "d",
                 "e",
                 "f",
                 "g",
                 "h",
                 "i",
                 "j",
                 "k",
                 "l",
                 "m",
                 "n",
                 "o",
                 "p",
                 "q",
                 "r",
                 "s",
                 "t",
                 "u",
                 "v",
                 "w",
                 "x",
                 "y",
                 "z",
                 "A",
                 "B",
                 "C",
                 "D",
                 "E",
                 "F",
                 "G",
                 "H",
                 "I",
                 "J",
                 "K",
                 "L",
                 "M",
                 "N",
                 "O",
                 "P",
                 "Q",
                 "R",
                 "S",
                 "T",
                 "U",
                 "V",
                 "W",
                 "X",
                 "Y",
                 "Z",
                 "Space",
                 "Slash",
                 "Equal",
                 "FF",
                 "_",
                 "SingleQuote",
                 "VerticalBar",
                 "Exclamation",
                 "Colon",
                 "SemiColon",
                 "BackSlash",
                 "LeftBrace",
                 "RightBrace",
                 "LeftBracket",
                 "RightBracket",
                 "Comma",
                 "GreaterThan",
                 "Plus",
                 "Star",
                 "LeftParen",
                 "RightParen",
                 "LF",
                 "CR",
                 "DoubleQuote",
                 "Percent",
                 "AtSign",
                 "BackQuote",
                 "Tilde",
                 "Sharp",
                 "DollarSign",
                 "Ampersand",
                 "Caret",
                 "QuestionMark",
                 "LessThan",
                 "EOF",
                 "CtlCharNotWS",
                 "AfterASCII",
                 "IDENT"
             };

    public final static int numTokenKinds = orderedTerminalSymbols.length;
    public final static boolean isValidForParser = true;
}
